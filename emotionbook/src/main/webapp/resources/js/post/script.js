var contentForm = new Vue({
  el: '#js-content-form',
  data: {
    newContent : {
      content : ''
    }
  },
  methods: {
    post: function () {
      $.ajax({
        type : 'POST',
        url : '/emotionbook/api/contents',
        contentType : 'application/json',
        data : JSON.stringify(this.newContent),
        dataType : 'json',
        success : function(json) {
          console.log("success");
        },
        error : function(json) {
          console.log("error");
        }
      });
    }
  }
})
