
var mainModule = angular.module('aurionpro.spa', ['ngRoute'])
mainModule.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'fragments/home.html',
            controller: 'HomeController'
        })
        .when('/about', {
            templateUrl: 'fragments/about.html',
            controller: 'AboutController'
        })
        .when('/career', {
            templateUrl: 'fragments/career.html',
            controller: 'CareerController'
        })
        .when('/home', {
            templateUrl: 'fragments/home.html',
            controller: 'HomeController'
        });
}]);

mainModule.controller('HomeController', ['$scope', function ($scope) {
    $scope.home = {
        data: "Hello from Home Page"
    }
}])

mainModule.controller('AboutController', ['$scope', function ($scope) {
    $scope.about = {
        data: "Hello from about Page"
    }
}])

mainModule.controller('CareerController', ['$scope', function ($scope) {
    $scope.career = {
        data: "Hello from career Page"
    }
}])


