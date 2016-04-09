angular.module('hello', [])
  .controller('home', function($http) {
  var self = this;
  $http.get('/http://localhost:8080/song/570945f762b507b2eae1de7d').then(function(response) {
    self.song = response.data;
  })
});