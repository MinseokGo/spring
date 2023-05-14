<template>
  <HomePageNav />
  <HomePageSetLoc />
  <WritePostContent />
  <WritePostSelect />
  <WritePostBtn />
</template>

<script>
// from 뒤 경로 확장자 생략 가능하지만 확장자 사용 권장
import HomePageNav from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageNav.vue";
import HomePageSetLoc from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageSetLoc.vue";
import WritePostContent from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/WritePostContent.vue";
import WritePostSelect from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/WritePostSelect.vue";
import WritePostBtn from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/WritePostBtn.vue";

export default {
  //name 속성은 없어도 보통의 동작에 이상 없음, 디버깅시 개발자도구에서 알아보기 쉬우려고 작성, 컴포넌트 구조가 재귀적일때에도 필요
  name: "WritePostView",
  components: {
    HomePageNav,
    HomePageSetLoc,
    WritePostContent,
    WritePostSelect,
    WritePostBtn,
  },
};
</script>
