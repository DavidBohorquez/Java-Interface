var people = [];
var aux = 0;
var liTug, divTug, imgSrc;

$(document).ready(function () {
    $("#btnRegister").on("click", function () {

        people.push(new Person($("#inputName").val() + " " + $("#inputSurname").val(), $("#inputPhone").val(), $("#inputAddress").val(), $("#inputEmail").val()));

        //alert(people[people.length - 1].name + "-" + people[people.length - 1].phone + "-" + people[people.length - 1].address + "-" + people[people.length - 1].email);
        //alert(aux);
        console.log(people[people.length - 1].name + "-" + people[people.length - 1].phone + "-" + people[people.length - 1].address + "-" + people[people.length - 1].email)

        if (aux < 8) {
            if (aux == 0) {
                liTug = $("<li class='list-group-item list-group-item-primary'>");
                imgSrc = "images/user.ico";
            } else if (aux == 1) {
                liTug = $("<li class='list-group-item list-group-item-success'>");
                imgSrc = "images/user1.ico";
            } else if (aux == 2) {
                liTug = $("<li class='list-group-item list-group-item-danger'>");
                imgSrc = "images/user2.ico";
            } else if (aux == 3) {
                liTug = $("<li class='list-group-item list-group-item-warning'>");
                imgSrc = "images/user3.ico";
            } else if (aux == 4) {
                liTug = $("<li class='list-group-item list-group-item-secondary'>");
                imgSrc = "images/user4.ico";
            } else if (aux == 5) {
                liTug = $("<li class='list-group-item list-group-item-dark'>");
                imgSrc = "images/user8.png";
            } else if (aux == 6) {
                liTug = $("<li class='list-group-item list-group-item-info'>");
                imgSrc = "images/user.ico";
            } else if (aux == 7) {
                liTug = $("<li class='list-group-item list-group-item-light'>");
                imgSrc = "images/user11.png";
            }

        } else {
            aux = 0;

            liTug = $("<li class='list-group-item list-group-item-primary'>");
            imgSrc = "images/user.ico";
        }

        divTug = $("<div class='card mb-3' style='max-width: 100%; max-height: 100%;"
            + "background-color:dodgerblue;'>");


        $("#contacts").append(
            liTug.append(
                divTug.append(
                    $("<div class='row no-gutters'>").append(
                        $("<div class='col-md-4' style='max-width: 20%;'>").append(
                            $("<img class='card-img' alt='...'>").attr("src", imgSrc)
                        ),
                        $("<div class='col-md-8'>").append(
                            $("<div class='card-body'>").append(
                                $("<h5 class='card-title' id='cardTitle'>").text(people[people.length - 1].name),
                                $("<div class='row'>").append(
                                    $("<dt class='col-sm-4'>").append("Teléfono"),
                                    $("<dd class='col-sm-8' id='ddPhone'>").text(people[people.length - 1].phone),

                                    $("<dt class='col-sm-4'>").append("Dirección"),
                                    $("<dd class='col-sm-8' id='ddAddress'>").text(people[people.length - 1].address),

                                    $("<dt class='col-sm-4'>").append("Email"),
                                    $("<dd class='col-sm-8' id='ddEmail'>").text(people[people.length - 1].email)
                                )
                            )
                        )
                    )
                )
            )
        );

        alert('El contacto "' + people[people.length - 1].name + '" ha sido \nalmacenado correctamente');

        /*$("#cardTitle").text(people[0].name);
        $("#ddPhone").text(people[0].phone);
        $("#ddAddress").text(people[0].address);
        $("#ddEmail").text(people[0].email);*/

        $("#inputName").attr("placeholder", "Nombre").val("");
        $("#inputSurname").attr("placeholder", "Apellido").val("");
        $("#inputPhone").attr("placeholder", "Número de teléfono").val("");
        $("#inputAddress").attr("placeholder", "Dirección").val("");
        $("#inputEmail").attr("placeholder", "Email").val("");

        aux++;
    });
});



