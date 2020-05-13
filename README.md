## Project setup
### Openfire
execute this command for openfire setup in docker:

`docker run --name openfire --hostname openfiretest.com -d --restart=always --publish 9090:9090 --publish 5222:5222 --publish 7777:7777 --volume ~/data/docker/openfire:/var/lib/openfire sameersbn/openfire:3.10.3-19`

#### Setup openfire
In first time you should configure openfire, follow this steps:
1. Go to http://localhost:9090
2. Choose a language
3. Set _localhost_ as Domain name
4. Select Embedded database
5. Select default as Profile Setting
6. Skip administrator password (default login: admin/password: admin for authenticating)

#### Create sniper
1. Go to Users/Groups tab
2. Click on Create New User
3. Set sniper as username
4. Set password = sniper
5. Click on Create user button

#### Create auction-item-54321
1. Go to Users/Groups tab
2. Click on Create New User
3. Set auction-item-54321 as username
4. Set password = auction
5. Click on Create user button

#### Create Group Auction
1. Go to User/groups
2. Click on Groups tab
3. Click on Create New Group
4. Set Auction as Group Name
5. Click on Create Group button

#### Add auction-item-54321 to Auction Group
1. Go to User/groups
2. Click on Groups tab
3. Click on Edit Group
4. in Auction Group, add user auction-item-54321


