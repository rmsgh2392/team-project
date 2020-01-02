<template>
  <v-container>
    <v-card>
			<v-container>
      <v-form>
				<v-container>
					<v-text-field label="이메일" type="email" required=""/>
					<v-text-field label="비밀번호" type="password" required=""/>
					<v-text-field label="비밀번호확인 " type="password" required=""/>
					<v-text-field label="닉네임" type="password" required=""/>
					<v-checkbox required label="확인문구 "/>
					<v-btn color="green" type="submit">로그인</v-btn>
					<v-btn  router-link to="/cart>회원가입</v-btn>
					</v-container>
	  		</v-form>
			<v-container>
    </v-card>
  </v-container>
</template>
<script>
export default {
	
}
</script>
<style scoped>

</style>