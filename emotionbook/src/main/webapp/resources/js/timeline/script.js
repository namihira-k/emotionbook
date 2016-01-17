var contentList = new Vue({
  el: '#js-content-list',
  data: {
    contents: null
  },

  created: function () {
    this.fetchContents()
  },

  methods: {
    fetchContents: function (emotionTagId) {
      var self = this;
      var targetUrl = '/emotionbook/api/contents';
      if (emotionTagId || emotionTagId==0) {
          targetUrl += '?emotionTagId=' + emotionTagId;
      }
      $.ajax({
        type : 'GET',
        url : targetUrl,
        dataType : 'json',
        success : function(data) {
          self.contents = data;
        }
      });
    }
  }
})
