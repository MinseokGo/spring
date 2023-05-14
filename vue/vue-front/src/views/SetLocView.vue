<template>
  <DaumAPI />
  <SetLocBtn/>
</template>

<script>
import DaumAPI from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/DaumAPI.vue";
import SetLocBtn from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/SetLocBtn.vue";

export default {
  name: "SetLocView",
  components: {
    DaumAPI,
    SetLocBtn,
  },
};
</script>
