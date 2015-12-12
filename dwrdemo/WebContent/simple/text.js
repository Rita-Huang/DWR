
function update() {
  var name = dwr.util.getValue("demoName");  //getValue=getElementById("xxx").value
  Demo.sayHello(name, loadinfo);
}

function loadinfo(data) {
    dwr.util.setValue("demoReply", data);
}
