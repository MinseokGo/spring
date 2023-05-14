<template>
  <HomePageNav />
  <HomePageSetLoc />
  <HomePageItem />
  <HomePageWritePost />
</template>

<script>
// from 뒤 경로 확장자 생략 가능하지만 확장자 사용 권장
import HomePageNav from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageNav.vue";
import HomePageSetLoc from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageSetLoc.vue";
import HomePageItem from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageItem.vue";
import HomePageWritePost from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageWritePost.vue";

export default {
  //name 속성은 없어도 보통의 동작에 이상 없음, 디버깅시 개발자도구에서 알아보기 쉬우려고 작성, 컴포넌트 구조가 재귀적일때에도 필요
  name: "HomePageView",
  components: {
    HomePageNav,
    HomePageSetLoc,
    HomePageItem,
    HomePageWritePost,
  },
};
</script>
