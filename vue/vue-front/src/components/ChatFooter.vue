<template>
  <div class="chat_box">
    <div class="chat_inp">
      <input type="text" placeholder="메시지를 입력하세요.">
    </div>
    <div class="chat_send_box">
      <img class="chat_send_btn" src="@/assets/chat_sendmsg_icon_btn.png">
    </div>
  </div>
</template>

<script>
export default {
  name: "ChatFooter",
};
</script>

<style scoped>
.chat_box {
  width: 100%;
  height: 6%;
  background-color: #F0F0F0;
  bottom: 0;
  position: absolute;
}

.chat_inp {
  width: 90%;
  height: 100%;
  float: left;
}

input[type=text] {
  width: 90%;
  height: 70%;
  left: 5%;
  top: 10%;
  border: none;
  background-color: #F0F0F0;
  font-size: 1.2rem;
  position: relative;
}

.chat_send_box {
  width: 10%;
  height: 100%;
  float: left;
}

.chat_send_btn {
  width: 80%;
  height: 100%;
  float: left;
}
</style>
