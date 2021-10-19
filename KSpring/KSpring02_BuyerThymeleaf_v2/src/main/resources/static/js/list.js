$(() => {
    function tableClickHandler() {
        const id = $(this).data("id")
        location.href = `/detail?userid=${id}`
    }
    $("table.buyer_list tr").on("click",tableClickHandler)

    // 임시
    $("ul li.home").on("click",function () {
        location.href = "/"
    })
});