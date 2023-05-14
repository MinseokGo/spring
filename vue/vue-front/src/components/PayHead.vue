<template>
  <div class="pay_head">
    <div class="back_btn" @click="back()">&lt;</div>
    <div class="center_box">결제 정보</div>
  </div>
</template>

<script>
export default {
  name: "PayHead",
  methods: {
    back() {
      this.$router.go(-1);
    }
  }
};
</script>

<style scoped>
.pay_head {
  width: 100%;
  height: 8%;
  border-radius: 0 0 15px 15px;
  box-shadow: 0 2px 2px 0 rgba(0,0,0,0.328);
  background-color: #FFEBA4;
}

.back_btn {
  width: 20%;
  height: 100%;
  text-align: center;
  line-height: 200%;
  float: left;
  font-size: 2rem;
  color: #D9C696;
  float: left;
}

.center_box {
  left: 30%;
  width: 80%;
  height: 100%;
  float: left;
}
</style>