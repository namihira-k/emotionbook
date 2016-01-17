var contentForm = new Vue({
  el: '#js-content-form',
  data: {
    newContent : {
      content : '',
      emotionTagId : 0
    }
  },
  methods: {
    post: function (redirectURL) {
      waitingDialog.show('投稿中...');
      var self = this;
      $.ajax({
        type : 'POST',
        url : '/emotionbook/api/contents',
        contentType : 'application/json',
        data : JSON.stringify(this.newContent),
        dataType : 'json',
        success : function() {
        },
        error : function() {
        },
        complete : function() {
          waitingDialog.hide();
          location.href = redirectURL + "?emotionTagId=" + self.newContent.emotionTagId;
        }
      });
    }
  }
})
