var contentList = new Vue({
    el: '#contentList',
    data: {
    	contents: null
    },

    created: function () {
    	this.fetchContents()
    },

    methods: {
    	fetchContents: function () {
			$.ajax({
				type : 'GET',
				url : '/emotionbook/api/contents',
				dataType : 'json',
				success : function(data) {
				    this.contents = data;
				}
			});
    	}
    }
})
