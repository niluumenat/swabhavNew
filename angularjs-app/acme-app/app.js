var mainModule = angular.module('acme.spa', ['ngRoute'])

mainModule.factory('ProductDataService', ['$http', '$routeParams', function ($http, $routeParams) {
    var service = {};
    service.getProducts = function () {
        return $http.get("assets/products.txt");
    }
    service.getProduct = function (products) {
        var p1;
        products.forEach(function (p) {
            if (p.productId == $routeParams.idToShow) {
                p1 = p;
            }
        })
        return p1;
    }
    return service;
}])

mainModule.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: 'home.html',
            controller: 'HomeController'
        })
        .when('/home', {
            templateUrl: 'home.html',
            controller: 'HomeController'
        })
        .when('/home', {
            templateUrl: 'home.html',
            controller: 'HomeController'
        })
        .when('/ProductList', {
            templateUrl: 'productList.html',
            controller: 'ProductListController'
        })
        .when('/productDetails/:idToShow', {
            templateUrl: 'productDetails.html',
            controller: 'ProductDetailsController'
        });
}]);

mainModule.controller('HomeController', ['$scope', function ($scope) {
    $scope.welcome1 = "Hello";
}])

mainModule.controller('ProductListController', ['$scope', 'ProductDataService', function ($scope, ProductDataService) {
    ProductDataService.getProducts()
        .then(function (x) {
            $scope.products = x.data;
            console.log($scope.products);

        })
        .catch(function (y) {
            $scope.fact = y.errors;
        })

    $scope.isVisible = true;
    $scope.hideShow_image = "Hide Image";

    $scope.showHide = function () {
        if ($scope.isVisible) {
            $scope.isVisible = false
            $scope.hideShow_image = "Show Image"
        } else {
            $scope.isVisible = true
            $scope.hideShow_image = "Hide Image"
        }
    }
}])

mainModule.controller('ProductDetailsController', ['ProductDataService', '$scope', function (ProductDataService, $scope) {
    ProductDataService.getProducts()
        .then(function (x) {
            $scope.products = x.data;
            $scope.product = ProductDataService.getProduct($scope.products);
        })
        .catch(function (y) {
            $scope.fact = y.errors;
        })
}])

mainModule.directive("starRating", function () {
    return {
        template:
        +"<div class='average-rating-container'>" +
            "  <ul class='rating'>" +
            "    <li ng-repeat='star in stars' class='star'>" +
            "    </li>" +
            "  </ul>" +
            "  <ul class='rating foreground' style='width:{{filledInStarsContainerWidth}}%'>" +
            "    <li ng-repeat='star in stars' class='filled'>" +
            "      <i class='glyphicon glyphicon-star'></i>" +
            "    </li>" +
            "  </ul>" +
            "</div>",
        scope: {
            averageRatingValue: "=ngModel",
            max: "="
        },
        link: function (scope) {
            scope.stars = [];
            for (var i = 0; i < scope.max; i++) {
                scope.stars.push({});
            }
            var starContainerMaxWidth = 100;
            console.log(scope.averageRatingValue)
            scope.filledInStarsContainerWidth = scope.averageRatingValue / scope.max * starContainerMaxWidth;
        }
    };
});