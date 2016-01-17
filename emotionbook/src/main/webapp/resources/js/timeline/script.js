var contentList = new Vue({
  el: '#js-content-list',
  data: {
    contents: null
  },

  created: function () {
    this.fetchContents()
  },

  methods: {
    fetchContents: function () {
      var self = this;
	  $.ajax({
	    type : 'GET',
		url : '/emotionbook/api/contents',
		dataType : 'json',
		success : function(data) {
		  self.contents = data;
	    }
	  });
    }
  }
})
