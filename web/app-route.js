app.config(['$routeProvider', function ($routeProvider) {

        $routeProvider.otherwise({
            redirectTo: '/'
        });

        $routeProvider.when('/', {
            templateUrl: "ejercicios/ejercicios-list.html"
        });
        
    }]);