<template>
  <div class="entry_info">
    <div class="entry_txt_box">
      <div class="entry_txt">공유 참여자</div>
      <div class="entry_people">2명</div>
    </div>
    <div class="entry_list_box">
      <div class="people">
        <img class="profile_icon" src="@/assets/pay_profile_icon.png">
        <div class="profile_name">허 은진님</div>
        <img class="profile_icon" src="@/assets/pay_profile_icon.png">
        <div class="profile_name">김 기태님</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "PayInfoEntry",
};
</script>

<style scoped>
.entry_info {
  width: 100%;
  height: 22%;
}

.entry_txt_box {
  width: 100%;
  height: 20%;
}

.entry_txt {
  width: 80%;
  height: 100%;
  float: left;
  font-size: 1.3rem;
}

.entry_people {
  width: 20%;
  height: 100%;
  float: left;
}

.entry_list_box {
  width: 100%;
  height: 80%;
}

.people {
  width: 100%;
  height: 25%;
}

.profile_icon {
  width: 15%;
  height: 100%;
  border-radius: 50px;
  float: left;
}

.profile_name {
  width: 85%;
  height: 100%;
  float: left;
  font-size: 1.5rem;
}
</style>
