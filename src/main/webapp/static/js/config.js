define(function(requirejs) {
	requirejs.config({
		paths: {
			"example": "js/lib/example/example"
		},

		packages: [
			{
				name: "mypackage",
				location: "js/package/mypackage"
			}
		],

		config: {
			"example": {
				foo: "bar"
			},
			"mypackage": {
				bar: "baz"
			}
		}
	});
});
