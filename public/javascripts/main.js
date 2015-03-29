// Выбор из списка-листа
function selectItem(obj) {
  if($(obj).hasClass("active")) {
    $("#myModal").modal("hide");
    $('#contractorName').val($(obj).text());
    $('#contractor_id').val($(obj).attr("id"));
  } else {
    $("#modal-list>a.active").removeClass("active");
    $(obj).addClass("active");

  }
}