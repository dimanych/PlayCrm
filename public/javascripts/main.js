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

function setItem() {
var f1 = document.getElementById('modal-list').getElementsByClassName('active')
for (var i=0; i<f1.length; i++)
selectItem(f1[i]);
}