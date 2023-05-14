<template>
  <PayHead />
  <PayInfoShare />
  <PayInfoPay />
  <PayInfoEntry />
  <PayFooter />
</template>

<script>
import PayHead from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/PayHead.vue";
import PayInfoShare from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/PayInfoShare.vue";
import PayInfoPay from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/PayInfoPay.vue";
import PayInfoEntry from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/PayInfoEntry.vue";
import PayFooter from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/PayFooter.vue";

export default {
  name: "PayView",
  components: {
    PayHead,
    PayInfoShare,
    PayInfoPay,
    PayInfoEntry,
    PayFooter,
  },
};
</script>
