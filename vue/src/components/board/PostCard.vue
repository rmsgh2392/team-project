<template>
	<v-container>
		<v-card>
			<v-img src="https://picsum.photos/id/11/500/300"
				lazy-src="https://picsum.photos/id/11/10/6"
				aspect-ratio="1"
				class="grey lighten-2"
				max-width="500"
				max-height="300"
			></v-img>
			<v-card-text>
				<div>
					<h3>첫번째 글 </h3>
					<div>간단한 첫번째 글 </div>
				</div>
			</v-card-text>
			<v-card-actions>
				<v-btn text color="orange">
					<v-icon>mdi-twitter-retweet</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-heart-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-comment-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-dots-horizontal</v-icon>
				</v-btn>
			</v-card-actions>
		</v-card>
        <v-card>
			<v-img src="https://picsum.photos/id/12/500/300"
				lazy-src="https://picsum.photos/id/11/10/6"
				aspect-ratio="1"
				class="grey lighten-2"
				max-width="500"
				max-height="300"
			>
			</v-img>
			<v-card-text>
				<div>
					<h3>두번째 글 </h3>
					<div>간단한 두번째 글 </div>
				</div>
			</v-card-text>
			<v-card-actions>
				<v-btn text color="orange">
					<v-icon>mdi-twitter-retweet</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-heart-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-comment-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-dots-horizontal</v-icon>
				</v-btn>
			</v-card-actions>
		</v-card>
		<v-card>
			<v-img src="https://picsum.photos/id/10/500/300"
				lazy-src="https://picsum.photos/id/11/10/6"
				aspect-ratio="1"
				class="grey lighten-2"
				max-width="500"
				max-height="300"
			>
			</v-img>
			<v-card-text>
				<div>
					<h3>세번째 글 </h3>
					<div>간단한 세번째 글 </div>
				</div>
			</v-card-text>
			<v-card-actions>
				<v-btn text color="orange">
					<v-icon>mdi-twitter-retweet</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-heart-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-comment-outline</v-icon>
				</v-btn>
				<v-btn text color="orange">
					<v-icon>mdi-dots-horizontal</v-icon>
				</v-btn>
			</v-card-actions>
		</v-card>
		<v-card>
			<v-list-item>
				<v-list-item-avatar color="grey"></v-list-item-avatar>
				<v-list-item-content>
				<v-list-item-title class="headline">Our Changing Planet</v-list-item-title>
				<v-list-item-subtitle>by Kurt Wagner</v-list-item-subtitle>
				</v-list-item-content>
			</v-list-item>
			<v-img
				src="https://cdn.vuetifyjs.com/images/cards/mountain.jpg"
				max-width="500"
				max-height="300"
			></v-img>
			<v-card-text>
				Visit ten places on our planet that are undergoing the biggest changes today.
			</v-card-text>
			<v-card-actions>
				<v-btn text	color="deep-purple accent-4">
				Read
				</v-btn>
				<v-btn text	color="deep-purple accent-4"> Bookmark
				</v-btn>
				<v-spacer></v-spacer>
				<v-btn icon>
				<v-icon>mdi-heart</v-icon>
				</v-btn>
				<v-btn icon>
				<v-icon>mdi-share-variant</v-icon>
				</v-btn>
			</v-card-actions>
		</v-card>
	</v-container>
</template>
<script>
export default {
	
}
</script>
<style scoped>
</style>