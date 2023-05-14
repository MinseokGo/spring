<template>
  <div class="box">
      <div class="title">
        자메이카 틍다리 먹으실 분!~...
      </div>
      <hr>
      <div class="content_box">
        <div class="content">
          장전초 정문에서 음식 공유하실분!
          제가 한 조각 밖에 못 먹어서 세 조각 드실 분 찾아요! 
          돈은 반반 내드릴게요.
        </div>
      </div>
      <hr>
      <div class="option_box">
        <div class="option_line">
          <div class="option">공유 메뉴</div>
          <div class="option_post">자메이카 통다리</div>
        </div>
        <div class="option_line">
          <div class="option">공유 시간</div>
          <div class="option_post">19:30분 주문</div>
        </div>
        <div class="option_line">
          <div class="option">공유 장소</div>
          <div class="option_post">장전초 정문</div>
        </div>
        <div class="option_line">
          <div class="option">공유 인원</div>
          <div class="option_post">2명</div>
        </div>
      </div>
      <hr>
    </div>
</template>

<script>
export default {
  name: "ViewPostContent",
};
</script>

<style scoped>
.box {
  width: 100%;
  height: 55%;
}
.title {
  width: 90%;
  height: 14%;
  line-height: 300%;
  font-size: 130%;
  display: block;
  margin: 0 auto;
}
.content_box {
  width: 100%;
  height: 40%;
}
.content {
  position: relative;
  top: 5%;
  display: block;
  margin: 0 auto;
  width: 90%;
  height: 90%;
}
.option_box {
  width: 100%;
  height: 35%;
}
.option_line {
  display: block;
  margin: 0 auto;
  width: 90%;
  height: 25%;
}
.option {
  width: 20%;
  height: 100%;
  float: left;
  line-height: 200%;
}
.option_post {
  float: left;
  width: 80%;
  height: 100%;
  line-height: 200%;
}
</style>
