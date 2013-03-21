define(function(requirejs) {
	requirejs.config({
		paths: {
			"example": "js/lib/example/example"
		},

		config: {
			"example": {
				foo: "bar"
			}
		}
	});
});
