/*
	DB 3대 Schema
    외부, 내부, 개념
    외부 : 모든 데이터는 Table 형태로 되어있다
    내부 : DBMS 엔진(SW)이 자체적으로 OS와 함께 연동되어
		Storage에 어떻게 데이터를 보관하는가 하는 관점
        데이터를 어떤 기준으로 저장할 것인가
        (ORACLE : TableSpace, MySQL : DataBase)
	개념 : 사용자의 SQL을 번역하여 실제 데이터에 어떻게 반영 할 것인가
		  조회된 데이터를 어떻게 하여 Table 모양으로 바꿀것인가
*/
/*
	RDBMS(Relational DataBase Management System)
		데이터베이스 관리 소프트웨어(ORACLE, MySQL, MSSQL,...)
	
    RDBMS 차원에서의 Schema
		Data를 보관하는 관리하는 가장 큰 주체가 누구냐
        일반 : DataBase를 기준으로 Schema
			  사용자는 login을 통한 권한을 획득한 사용자
		Oracle : User 를 기준으로 Schema
*/
-- naraDB Schema 생성하기
CREATE DATABASE naraDB;
USE naraDB;

SHOW TABLES;
DESC tbl_buyer;
DESC tbl_sales;

INSERT INTO tbl_buyer ( userid, name)
VALUES('B001',"홍길동");
INSERT INTO tbl_buyer ( userid, name)
VALUES('B002',"성춘향");

SELECT * FROM tbl_buyer;

-- UPDATE 를 실행할 때는 
-- 반드시 변경하고자 하는 데이터의 PK 를 확인하고 
-- PK 를 조건절(WHERE) 에 지정하여 실행을 한다
UPDATE tbl_buyer 
SET tel = '010-111-1111'
WHERE userid = 'B001';

-- DELETE 를 실행할 때도
-- 반드시 삭제하고자 하는 데이터의 PK 를 확인하고
-- PK 를 조건절(WHERE) 에 지정하여 실행을 한다
DELETE FROM tbl_buyer
WHERE userid = 'B002';

-- 보안사고 : 권한이 없는 사용자가 침투하여 사고내기
-- 무결성 파괴 : 권한이 있는 사용자가 잘못하여 DB 에 문제를 일으킨 것이다
-- 			  역할을 적절하게 부여하는 것이 좋다
-- 			  PK 관리를 잘 해야 한다
-- 			  FK 관리도 잘 해야 한다

SHOW tables;
DESC tbl_sales;
DESC hibernate_sequence;

SELECT * FROM tbl_buyer;
SELECT * FROM tbl_sales;

-- 고객별로 몇번씩 거래했냐?
SELECT userid,COUNT(userid) FROM tbl_sales
GROUP BY userid;

-- 고객별로 총 구입금액
SELECT userid, SUM(total) FROM tbl_sales
GROUP BY userid;

-- 상품별로 판매 횟수
SELECT pname, count(pname) FROM tbl_sales
GROUP BY pname
ORDER BY count(pname) DESC;

-- 상품별로 총 판매 갯수
SELECT pname, sum(qty) FROM tbl_sales
GROUP BY pname;

-- 상품별로 총 판매금액
SELECT pname, sum(total) FROM tbl_sales
GROUP BY pname;

-- 고객별로 어떤 상품을 몇번 구입했나
SELECT userid, pname, COUNT(*) FROM tbl_sales
GROUP BY userid, pname
ORDER BY userid, pname;

-- 고객별로 어떤 상품을 몇개씩 구입했나
-- 많이 구매한 순으로 정렬
SELECT userid, pname, SUM(qty) FROM tbl_sales
GROUP BY userid, pname
ORDER BY userid, SUM(qty) DESC;

-- 고객별로 각 상품을 구매한 총금액
SELECT userid, pname, SUM(total) FROM tbl_sales
GROUP BY userid, pname
ORDER BY userid, SUM(total) DESC;

SELECT S.userid, B.name, pname, SUM(total) FROM tbl_sales S
LEFT JOIN tbl_buyer B
	ON S.userid = B.userid
GROUP BY S.userid,B.name, pname
ORDER BY S.userid, SUM(total) DESC;


