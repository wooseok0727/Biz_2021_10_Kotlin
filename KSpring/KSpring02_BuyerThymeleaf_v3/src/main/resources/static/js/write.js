$(function() {
    // 저장버튼을 클릭했을 때
    $("button.btn_save").on("click",function() {
            $("form.write_form").submit();
        })
})