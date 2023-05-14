<template>
  <div class="share_info">
    <div class="share_txt">공유 정보</div>
    <div class="share_con">
      <img class="shop_icon" src="@/assets/pay_shop_icon.png">
      <div class="info_box">장전초 정문</div>
      <div class="info_box">19:30 주문</div>
      <div class="info_box">BBQ</div>
    </div>
    <hr>
  </div>
</template>

<script>
export default {
  name: "PayInfoShare",
};
</script>

<style scoped>
.share_info {
  width: 100%;
  height: 25%;
}

.share_txt {
  width: 100%;
  height: 30%;
  font-size: 1.5rem;
}

.share_con {
  width: 100%;
  height: 70%;
}

.shop_icon {
  width: 25%;
  height: 80%;
  float: left;
  bottom: 0;
}

.info_box {
  width: 15%;
  height: 20%;
  float: left;
  font-size: 0.8rem;
  text-align: center;
  line-height: 250%;
  top: 30%;
  position: relative;
  background-color: white;
  box-shadow: 0 2px 2px 0 rgba(0,0,0,0.328);
  border-radius: 15px;
}
</style>
