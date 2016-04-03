app.config(['$routeProvider', function ($routeProvider) {

        $routeProvider.when('/', {
            templateUrl: "ejercicios/ejercicios-list.html",
            controller: "ListController"
        });
        
        $routeProvider.otherwise({
            redirectTo: '/'
        });
        
    }]);