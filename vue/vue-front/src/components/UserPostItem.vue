<template>
  <div class="post_box">
    <div class="post_main">내가 작성한 글</div>
    <hr>
    <div class="post_list">
      <div class="post">자메이카 통다리 두 조각씩 드실분~!</div>
    </div>
  </div>
</template>

<script>
export default {
  name: "UserPostItem",
};
</script>

<style scoped>
.post_box {
  width: 100%;
  height: 57%;
}

.post_main {
  width: 90%;
  height: 15%;
  display: block;
  margin: 0 auto;
  font-size: 2rem;
  line-height: 200%;
}
.post_list {
  width: 90%;
  height: 80%;
  display: block;
  margin: 0 auto;
}
.post {
  width: 100%;
  height: 25%;
  font-size: 1.3rem;
  line-height: 400%;
}
</style>