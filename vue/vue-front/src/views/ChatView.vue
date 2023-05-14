<template>
  <ChatHead />
  <ChatMessage />
  <ChatFooter />
</template>

<script>
import ChatHead from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ChatHead.vue";
import ChatMessage from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ChatMessage.vue";
import ChatFooter from "/Users/minseokgo/Documents/GitHub/spring/vue/vue-front/src/components/ChatFooter.vue";

export default {
  name: "ChatView",
  components: {
    ChatHead,
    ChatMessage,
    ChatFooter,
  },
};
</script>
