<template>
<div>
	<v-container>
		<v-card style="margin-bottom: 20px">
			<v-container>
					<v-subheader>프로필</v-subheader>
			</v-container>
			<v-form>
				<v-text-field label="닉네임" required />
				<v-btn color="blue" type="submit">수정</v-btn>
			</v-form>
		</v-card>
		<v-card style="margin-bottom: 20px">
			<v-container>
					<v-subheader>팔로잉</v-subheader>
					<div>
						<ul>
							<li>
								<span>슈퍼맨</span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
						<ul>
							<li>
								<span>원더우먼</span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
						<ul>
							<li>
								<span>아쿠아맨 </span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
					</div>
			</v-container>
		</v-card>
		<v-card style="margin-bottom: 20px">
			<v-container>
					<v-subheader>팔로워</v-subheader>
					<div>
						<ul>
							<li>
								<span>슈퍼맨</span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
						<ul>
							<li>
								<span>원더우먼</span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
						<ul>
							<li>
								<span>아쿠아맨 </span>
								<v-icon>mdi-minus-circle-outline</v-icon>
							</li>
						</ul>
					</div>
			</v-container>
		</v-card>
	</v-container>
</div>	
</template>
<script>
export default {
	components:{

	}
	
}
</script>
<style scoped>
</style>