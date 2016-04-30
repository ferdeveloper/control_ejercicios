//List Controller
app.controller("ListController", ['$scope', '$log', '$http', function ($scope, $log, $http) {

        $http({
            method: 'GET',
            url: '/russafa/api/Ejercicios/'
        }).success(function (data, status, headers, config) {
            $scope.ejercicios = data;
       
        }).error(function (data, status, headers, config) {
            console.log('Falla');
            alert("Ha fallado la petición list. Estado HTTP:" + status);
        });

}]);

//$(document).ready ( function () {
//    $(document).on ("click", ".clickable-row", function () {
//        alert("hi");
//        window.document.location = $(this).data("www.marca.com");
//    });
//});