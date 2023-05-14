<template>
  <div class="foot_box">
    <div class="post_btn" @click="post()">게시하기</div>
  </div>
</template>

<script>
export default {
  name: "WritePostBtn",
  methods: {
    post() {
      this.$router.go(-1);
    }
  }
};
</script>

<style>
.foot_box {
  width: 100%;
  height: 12%;
}

.post_btn {
  width: 30%;
  height: 60%;
  display: block;
  margin: 0 auto;
  top: 20%;
  position: relative;
  background-color: #FFEBA4;
  border-radius: 15px;
  text-align: center;
  font-size: 1.5rem;
  line-height: 250%;
}
</style>
