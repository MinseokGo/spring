<template>
  <div class="chat_head">
    <div class="back_btn" @click="back()">&lt;
    </div>
    <div class="opposit_box">허 은진님</div>
    <div class="pay_box">
      <div class="pay_btn" @click="popup()">결제 참여</div>
    </div>
  </div>
  <div class="popup_box" v-show="is_show">
    <div class="popup_1">결제를 진행하시겠습니까?</div>
    <div class="popup_2">
      <div class="pay_sel" @click="pay()">네</div>
      <div class="pay_sel2" @click="popup()">아니오</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ChatHead",
  methods: {
    popup() {
      this.is_show = !this.is_show;
    },
    pay() {
      this.$router.push('/PayView');
    },
    back() {
      this.$router.go(-1);
    }
  },
  data() {
    return {
      is_show: false
    }
  }
};
</script>

<style scoped>
.chat_head {
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
}

.opposit_box {
  width: 60%;
  height: 100%;
  text-align: center;
  line-height: 350%;
  float: left;
}

.pay_box {
  width: 20%;
  height: 100%;
  text-align: center;
  line-height: 400%;
  float: left;
}

.pay_btn {
  width: 60%;
  height: 50%;
  top: 25%;
  left: 25%;
  position: relative;
  background-color: #D9C696;
  border-radius: 5px;
  font-size: 0.8rem;
  line-height: 280%;
}

.popup_box {
  width: 70%;
  height: 30%;
  display: block;
  margin: 0 auto;
  top: 20%;
  position: relative;
  background-color: #F0F0F0;
  border-radius: 15px;
}

.popup_1 {
  width: 100%;
  height: 70%;
  text-align: center;
  line-height: 900%;
  position: relative;
  font-size: 1.2rem;
}

.popup_2 {
  width: 100%;
  height: 30%;
}

.pay_sel {
  width: 25%;
  height: 40%;
  float: left;
  left: 20%;
  position: relative;
  background-color: #D9C696;
  border-radius: 15px;
  text-align: center; 
  line-height: 200%;
}

.pay_sel2 {
  width: 25%;
  height: 40%;
  float: left;
  left: 30%;
  position: relative;
  background-color: #D9C696;
  border-radius: 15px;
  text-align: center; 
  line-height: 200%;
}
</style>
