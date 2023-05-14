<template>
  <div class="chatlistbox">
    <ul>
      <li v-for="item in list" v-bind:key="item">
        <div class="chatindex">
          <img src="@/assets/chatlist_shop_icon.png" class="shop_icon">
          <div class="chat_info">
            <div class="info_line" @click="chat()">
              {{ item.at(0) }}
            </div>
            <div class="info_line">
              {{ item.at(1) }}
            </div>
            <div class="info_line">
              {{ item.at(2) }}
            </div>
          </div>
        </div>
        <hr>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "ChatListItem",
  methods: {
    chat() {
      this.$router.push('/ChatView');
    }
  },
  data() {
    return {
      list: [['허은진님과의 대화방', '네, 그렇게 하시죠.', '장전초'],['김수진', 'ㄱㄱ', '금전초'],['고민석', 'ㄷㅊㄹ', '남일고']]
    };
  }
};
</script>

<style scoped>
.info_line {
  height: 33.3%;
  width: 100%;
}
.chat_info {
  width: 78%;
  height: 100%;
  float: left;
}


.shop_icon {
  width: 22%;
  height: 100%;
  float: left;
}

.chatlistbox {
  width: 100%;
  height: 86.5%;
}

.chatindex {
  width: 100%;
  height: 100%;
  bottom: 5%;
}

ul {
  list-style: none;
}

li {
  left: -40px;
  position: relative;
  width: 100%;
  height: 100px;
}

hr {
  position: relative;
  bottom: 10%;
}
</style>