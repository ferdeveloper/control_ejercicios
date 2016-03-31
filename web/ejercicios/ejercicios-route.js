app.config(['$routeProvider', function ($routeProvider) {

        $routeProvider.when('/list/', {
            templateUrl: "ejercicios/ejercicios-list.html",
            controller: "ListController"
        });
        
//        $routeProvider.when('/find/:nombre?', {
//            templateUrl: "entidadbancaria/entidadbancaria-find.html",
//            controller: "FindController"
//        });
//
        $routeProvider.when('/get/:idEjercicio', {
            templateUrl: "ejercicios/ejercicios-get.html",
            controller: "GetController"
        });
//

        $routeProvider.when('/insert/', {
            templateUrl: "ejercicios/ejercicios-insert.html",
            controller: "InsertController"
        });

        $routeProvider.when('/delete/:idEjercicio', {
            templateUrl: "ejercicios/ejercicios-delete.html",
            controller: "DeleteController"
        });


        $routeProvider.when('/update/:idEjercicio', {
            templateUrl: "ejercicios/ejercicios-update.html",
            controller: "UpdateController"
        });
        
        $routeProvider.when('/admin/', {
            templateUrl: "ejercicios/ejercicios-admin.html",
            controller: "ListController"
        });

    }]);