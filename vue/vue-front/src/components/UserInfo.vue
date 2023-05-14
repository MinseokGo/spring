<template>
  <div class="user_box">
    <div class="profile_main_box">
      <img class="profile_icon" src="@/assets/userinfo_profile_icon.png">
      <div class="profile_main"><span>김 기태님의 정보</span></div>
    </div>
    <div class="profile_txt">
      <div class="profile_info">
        <div class="info_title">아이디</div>
        <div class="info_con">kt8619</div>
      </div>
      <div class="profile_info">
        <div class="info_title">닉네임</div>
        <div class="info_con">딱좋노</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "UserInfo",
};
</script>

<style scoped>
.user_box {
  width: 100%;
  height: 30%;
}

.profile_main_box {
  width: 100%;
  height: 40%;
}

.profile_icon {
  width: 20%;
  height: 100%;
  float: left;
  border-radius: 45px;
}

.profile_main {
  width: 80%;
  height: 100%;
  float: left;
}
.profile_main > span{
  float: left;
  line-height: 300%;
  font-size: 2rem;
  left: 10%;
  position: relative;
}
.profile_txt {
  width: 100%;
  height: 60%;
}

.profile_info {
  width: 90%;
  height: 25%;
  display: block;
  margin: 0 auto;
}

.info_title {
  width: 20%;
  height: 100%;
  float: left;
}
.info_con {
  width: 80%;
  height: 100%;
  float: left;
}

</style>
