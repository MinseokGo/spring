<template>
  <div class="content">
    <img src="@/assets/login____icon.png" class="login_img">
    <div class="box">
      <div class="id_bar">
        <img src="@/assets/login_id_icon.png" class="bar_img">
        <input type="text" class="inp" placeholder="ID">
      </div>
      <div class="pass_bar">
        <img src="@/assets/login_lock_icon.png" class="bar_img">
        <input type="password" class="inp" placeholder="PassWord">
      </div>
    </div>
    <div class="login_btn">로그인</div>
  </div>
</template>

<script>
export default {
  name: "LoginContent",
};
</script>

<style scoped>
.content{
  position: relative;
  top: 10%;
  height: 70%;
  width: 100%;
}
.login_img{
  position: relative;
  top:0px;
  display: block;
  margin: 0 auto;
  height: 25%;
  width: 30%;
}
.box{
  position: relative;
  top:10%;
  display: block;
  margin: 0 auto;
  width: 70%;
  height: 35%;
  background-color: #ffeba4;
  border-radius: 15px 15px 15px 15px;
  box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.15);
}
.id_bar{
  display: block;
  margin: 0 auto;
  position: relative;
  top:32%;
  width: 85%;
  height: 15%;
  background-color: white;
  border-radius: 15px;
}
.pass_bar{
  display: block;
  margin: 0 auto;
  position: relative;
  top:42%;
  width: 85%;
  height: 15%;
  background-color: white;
  border-radius: 15px;
}
.bar_img{
  position: relative;
  left: 2%;
  top: 5%;
  height:80%;
  line-height:80%;
  float: left;
  width:9%;
}
.inp{
  position: relative;
  font-size: 100%;
  left: 4%;
  float: left;
  height: 90%;
  line-height:550%;
  width:80%;
  border: none;
}
.login_btn{
  font-size: 110%;
  display: block;
  padding: 2% 0 2% 0;
  margin: 0 auto;
  position: relative;
  top: 20%;
  width: 30%;
  text-align: center;
  background-color: #ffeba4;
  border-radius: 20px;
}
</style>