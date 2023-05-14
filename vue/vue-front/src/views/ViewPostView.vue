<template>
  <HomePageNav />
  <HomePageSetLoc />
  <ViewPostContent />
  <ViewPostStoreInfo />
  <ViewPostBtn />
</template>

<script>
// from 뒤 경로 확장자 생략 가능하지만 확장자 사용 권장
import HomePageNav from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageNav.vue";
import HomePageSetLoc from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/HomePageSetLoc.vue";
import ViewPostContent from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ViewPostContent.vue";
import ViewPostStoreInfo from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ViewPostStoreInfo.vue";
import ViewPostBtn from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ViewPostBtn.vue";

export default {
  //name 속성은 없어도 보통의 동작에 이상 없음, 디버깅시 개발자도구에서 알아보기 쉬우려고 작성, 컴포넌트 구조가 재귀적일때에도 필요
  name: "ViewPostView",
  components: {
    HomePageNav,
    HomePageSetLoc,
    ViewPostContent,
    ViewPostStoreInfo,
    ViewPostBtn,
  },
};
</script>
