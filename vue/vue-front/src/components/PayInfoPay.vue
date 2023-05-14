<template>
  <div class="pay_info">
    <div class="pay_txt">결제 정보</div>
    <div class="pay_con">
      <div class="pay_list">
        <div>자메이카</div>
        <div>배달팁</div>
        <div>공유 대행 수수료</div>
        <div>합산 금액</div>
        <div>총 결제 금액</div>
      </div>
      <div class="pay_money">
        <span>21500원</span>
        <br>
        <span>3000원</span>
        <br>
        <span>500원</span>
        <br>
        <span>25000원</span>
        <br>
        <span>12500원</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "PayInfoPay",
};
</script>

<style scoped>
span {
  float: right;
}
.pay_info {
  width: 100%;
  height: 35%;
}

.pay_txt {
  top: 5%;
  position: relative;
  font-size: 1.5rem;
  height: 20%;
  width: 100%;
}

.pay_con {
  top: 5%;
  position: relative;
  width: 100%;
  height: 70%;
}

.pay_list {
  position: relative;
  top: 5%;
  width: 70%;
  height: 100%;
  float: left;
}

.pay_money {
  position: relative;
  top: 5%;
  width: 30%;
  height: 100%;
  float: left;
}
</style>
