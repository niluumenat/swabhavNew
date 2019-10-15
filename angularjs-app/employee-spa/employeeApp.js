
var mainModule = angular.module('aurionpro2.spa', ['ngRoute'])
mainModule.factory('EmployeeService', function ($window, $q) {
    var service = {};
    service.get = function () {
        return employees = angular.fromJson($window.localStorage.getItem('employeeDetails'));
    }

    service.getById = function (id) {
        var employees = angular.fromJson($window.localStorage.getItem('employeeDetails'));
        employees.forEach(function (e) {
            if (e.Id == id) {
                empToEdit = e;
            }
        })
        console.log(empToEdit);
        return empToEdit;
    }

    service.add = function (addEmp) {
        $window.localStorage.setItem('employeeDetails', angular.toJson(addEmp));
    }
    return service;
})


mainModule.config(['$routeProvider', function ($routeProvider) {

    $routeProvider
        .when('/', {
            templateUrl: 'fragments/home.html',
            controller: 'HomeController'
        })
        .when('/Add', {
            templateUrl: 'fragments/add.html',
            controller: 'AddController'
        })
        .when('/Edit/:idToEdit', {
            templateUrl: 'fragments/edit.html',
            controller: 'EditController'
        })
        .when('/home', {
            templateUrl: 'fragments/home.html',
            controller: 'HomeController'
        });

}]);

mainModule.controller('HomeController', ['$scope','EmployeeService', function ($scope,EmployeeService) {
    $scope.employees= EmployeeService.get();
}])

mainModule.controller('EditController', ['$scope', '$routeParams', '$window', 'EmployeeService', function ($scope, $routeParams, $window, EmployeeService) {
    $scope.tempId = $routeParams.idToEdit;

    var empToEdit = EmployeeService.getById($scope.tempId)
    $scope.id=empToEdit.Id
    $scope.name = empToEdit.Name
    $scope.selectedJob = empToEdit.Job
    $scope.salary = empToEdit.Salary

    $scope.edit = function () {
        var employees = angular.fromJson($window.localStorage.getItem('employeeDetails'));
        
        employees.forEach(function (e) {
            if (e.Id == $scope.tempId) {
                e.Name = $scope.name;
                e.Job = $scope.selectedJob;
                e.Salary = $scope.salary;
            }
        })
        $window.localStorage.setItem('employeeDetails', angular.toJson(employees));
        $window.location = "#/home.html";

    }

}])

mainModule.controller('AddController', ['EmployeeService', '$scope', '$window', function (EmployeeService, $scope, $window) {
    $scope.employees;

    $scope.addEmployee = function () {
        var id = Date.now();
        if (JSON.parse($window.localStorage.getItem('employeeDetails')) != null) {
            $scope.employees = angular.fromJson($window.localStorage.getItem('employeeDetails'));

        } else {
            $scope.employees = [];
        }
        var emp = { 'Id': id, 'Name': $scope.name, 'Job': $scope.selectedJob, 'Salary': $scope.salary }
        $scope.employees.push(emp);
        EmployeeService.add($scope.employees)

        $window.location = "#/home.html";
    }
}])


