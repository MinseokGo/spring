<template>
  <div id="app" class="outside_box">
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  name: "app",
  components: {},
};
</script>

<style scoped>
body {
    width: 100%;
    height: 100%;
    background-color: #E2E2E2;
}

.outside_box {
    width: 470px;
    height: 800px;
    left: 50%;
    top: 0;
    position: absolute;
    transform: translate(-50%, 0);
    background-color: white;
    border-radius: 15px;
}
</style>
