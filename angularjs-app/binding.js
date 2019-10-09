angular.module('modA', [])
    .controller('ControllerA', ['$scope', '$timeout', function ($scope, $timeout) {
        $scope.student = {
            id: 101,
            name: 'Nilam',
            cgpa: 7.0
        }
        $timeout(function () {
            $scope.student = {
                id: 403,
                name: 'Komal',
                cgpa: 8.9
            }
        }, 3000)
    }])