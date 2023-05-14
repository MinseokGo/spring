<template>
  <div class="nav">
    <div class="home_btn">
      <img src="@/assets/home_home_icon_btn.png" class="nav_img" />
      <div class="nav_text">홈</div>
    </div>
    <div class="chat_btn">
      <img src="@/assets/home_chat_icon_btn.png" class="nav_img" />
      <div class="nav_text">채팅</div>
    </div>
    <div class="info_btn">
      <img src="@/assets/home_userinfo_icon_btn.png" class="nav_img" />
      <div class="nav_text">내정보</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "HomePageNav",
};
</script>

<style scoped>
.nav {
  width: 100%;
  height: 10%;
  background-color: #ffeba4;
  border-radius: 0 0 15px 15px;
  box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.15);
}
.nav_text {
  text-align: center;
  position: relative;
  top: 20px;
}
.nav_img {
  position: relative;
  top: 15px;
  width: 30px;
  height: 30px;
  display: block;
  margin: 0 auto;
}
.home_btn {
  float: left;
  width: 33%;
  height: 100%;
}

.chat_btn {
  float: left;
  width: 33%;
  height: 100%;
  position: relative;
}
.info_btn {
  float: left;
  width: 33%;
  height: 100%;
  position: relative;
}
</style>
