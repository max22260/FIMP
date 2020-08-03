# class user 
class User :

    def __init__(self , FirstName, SecondName , id  , Sid , address , Mail , UserName , password ):
        self.FirstName = FirstName 
        self.SecondName = SecondName
        self.id = id 
        self.Sid = Sid
        self.address = address
        self.Mail = Mail
        self.UserName = UserName
        self.password = password


# Frist Name getter and setter 
    def SetFristName (self ,FirstName):
        self.FirstName = FirstName    

    def GetFirstName (self):
        return self.FirstName

# Second Name Getter and Setter 
    def SetSecondName(self , SecondName):
        self.SecondName = SecondName

    def GetSecondName (self):
        return self.SecondName

# id Getter and Setter
    def SetId (self , id):
        self.id = id                     

    def GetId (self):
        return self.id

# Sid Getter and Setter   
    def SetSid(self, Sid ):
        self.Sid = Sid

    def GetSid(self):
        return self.Sid    

# Address Getter and Setter
    def SetAddress (self , address):
        self.address = address

    def GetAdress (self):
        return self.address  

# Mail Getter and Setter
    def SetMail (self , mail):
        self.Mail = mail
    
    def GetMail(self):
        return self.Mail

# UserName Setter and Getter
    def SetUserName (self , UserName):
        self.UserName = UserName

    def GetUserName(self):
        return self.UserName              

# Password Setter and Getter
    def SetPassword (self , Password):
        self.password = Password 

    def GetPassword (self):
        return self.password    
