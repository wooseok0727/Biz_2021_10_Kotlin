$(function() {
    const button = $("div.btn_box button")
    if(button) {
        $(button).on("click",function() {
            const className = $(this).attr("class")

            if(className.includes("btn_save")) {
                $("form.write_form").submit();
            } else if(className.includes("btn_list")) {
                location.href = `${rootPath}`
            }
        })
    }
})


