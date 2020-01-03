<template>
<div>
	<form name="join_form">
		<table class="tab" align="center">
		<tr bgcolor="#ECECEC" align="center">
			<td colspan="2">회원가입</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center" style="width: 20%">아이디</td>
			<td>
				<input type="text" id="id" size="12" maxlength="12" style="width: 100%;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">패스워드</td>
			<td><input type="password" id="pwd" size="12" maxlength="20" style="width: 100%;"></td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">이름</td>
			<td>
				<input type="text" id="name" size="12" maxlength="20" style="width: 100%;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">닉네임</td>
			<td>
				<input type="text" id="nickname" size="12" maxlength="20" style="width: 100%;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">체중</td>
			<td>
				<input type="text" id="weight" size="12" maxlength="3" style="width: 100%;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">신장</td>
			<td>
				<input type="text" id="height" size="12" maxlength="3" style="width: 100%;">
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">성별</td>
			<td>
				<input type="radio" id="sex" value="1">남
				<input type="radio" id="sex" value="2">여
			</td>
		</tr>
		<tr>
			<td bgcolor="#ECECEC" align="center">나이</td>
			<td>
				<input type="text" id="age" size="12" maxlength="3">
			</td>
		</tr>			
		<tr>
			<td bgcolor="#ECECEC" align="center">운동경력(레벨)</td>
			<td>
				<select id="level" style="width: 15%;">
					<option value="1">★</option>
					<option value="2">★★</option>
					<option value="3">★★★</option>
					<option value="4">★★★★</option>
					<option value="5">★★★★★</option>
				</select>
			</td>
			<tr>
				<td bgcolor="#ECECEC" align="center">근골격</td>
				<td>
					<input type="text" id="muscle" size="12" maxlength="20" style="width: 100%;">
				</td>
			</tr>
			<tr>
				<td bgcolor="#ECECEC" align="center">체지방률</td>
				<td>
					<input type="text" id="fat" size="12" maxlength="20" style="width: 100%;">
				</td>
			</tr>
			<tr>
				<td bgcolor="#ECECEC" align="center">주소</td>
				<td>
					<input type="text" id="address1" size="12" maxlength="20" style="width: 100%;"><br/>
					<input type="text" id="address2" size="12" maxlength="30" style="width: 100%;">
				</td>
			</tr>
		</table>
	</form>
</div>
</template>
<script>

</script>
<style scoped>
.tab{width: 70%; height:10px ; border : 2px solid black;}
</style>