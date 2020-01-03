<template>
  <div id="app">
    <v-app>
      <nav>
        <v-card color="grey lighten-4" flat height="80px">
          <v-toolbar dark color="blue-grey lighten-2">
            <v-toolbar-title>Title</v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-text-field
                lable="검색"
                hide-details
                prepend-icon="mdi-magnify"
                :style="{display:'flex',alignItems:'center'}"
              />
              <v-btn  text router-link to="/profile" :style="{display:'flex',alignItems:'center'}">
                <div>프로필</div>
              </v-btn>
              <v-btn text router-link to="/postCard" :style="{display:'flex',alignItems:'center'}">
                <div>게시글 보기</div>
              </v-btn>
            </v-toolbar-items>
            <v-icon>mdi-heart</v-icon>
            <v-btn icon>
              <v-icon>mdi-dots-vertical</v-icon>
            </v-btn>
          </v-toolbar>
        </v-card>
      </nav>
      <v-row>
        <v-col cols="12" xs="12" md="4">왼쪽</v-col>
        <v-col cols="12" xs="12" md="8">
          <template>
                      컨텐츠
          </template>
          <router-view/>
        </v-col>
      </v-row>
    </v-app>
  </div>
</template>
<script>
export default {
  name: "App",
  data: () => ({})
};
</script>
<style scoped>
</style>