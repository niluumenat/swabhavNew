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
            $scope.ratings = [{
                max: 5
            }];
            $scope.getStars = function (rating) {
                var val = parseFloat(rating);
                var size = val / 5 * 100;
                return size + '%';
            }

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
            $scope.ratings = [{
                max: 5
            }];
            $scope.getStars = function (rating) {
                var val = parseFloat(rating);
                var size = val / 5 * 100;
                return size + '%';
            }
            $scope.product = ProductDataService.getProduct($scope.products);
            console.log($scope.product)
        })
        .catch(function (y) {
            console.log(y.errors)
            $scope.fact = y.errors;
        })
}])

mainModule.directive('starRating', function () {
    return {
        restrict: 'A',
        template: '<ul class="rating">' +
            '<li ng-repeat="star in stars" ng-class="star">' +
            '\u2605' +
            '</li>' +
            '</ul>',
        scope: {
            ratingValue: '=',
            max: '='
        },
        link: function (scope, elem, attrs) {
            scope.stars = [];
            
            for (var i = 0; i < scope.max; i++) {
                scope.stars.push({
                    filled: i < scope.ratingValue
                });
            }
        }
    }
});