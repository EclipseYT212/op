local Robberys = {
	['1'] = 'bank',
	['2'] = 'Jewelrys',
	['3'] = 'Museum',
	['4'] = 'PowerPlant',
	['5'] = 'Passenger Train',
	['6'] = 'Cargo Train',
	['7'] = 'CargoShip',
	['8'] = 'CargoPlane',
	['9'] = 'GasStations',
	['10'] = 'DonutShop',
	['11'] = 'MoneyTruck',
	['12'] = 'HomeVault',
	['13'] = 'Tomb',
	['14'] = 'Casino',
	['15'] = 'Mansion'
}
function get_rob(nome)
	for i, v in pairs(Robberys) do
		if v:lower() == nome:lower() then
			return i
		end
	end
end

function is_opened(rob)
	local roubo = get_rob(rob)

	local State = game:GetService('ReplicatedStorage').RobberyState:FindFirstChild(roubo)

	return (tostring(State) == 'nil' and 'Closed') or
		((State.Value == 1 and 'Open') or (State.Value == 2 and 'stealing') or (State.Value == 3 and 'Closed'))
end


if is_opened("Casino") == "Open" or is_opened("Casino") == "Closed" then
	print(is_opened("Casino"))
	game.StarterGui:SetCore("SendNotification", {
		Title = "Teleporting to the Casino"; -- the title 
		Text = "Explosive Menu"; -- what the text says 
		Duration = 10; -- how long the notification should in secounds
	})

	local teleport = loadstring(game:HttpGet("https://raw.githubusercontent.com/Introvert1337/RobloxReleases/main/Scripts/Jailbreak/Teleporation.lua"))();
	teleport(CFrame.new(-249.948486328125, 23.976511001586914, -4661.296875))
	wait(1)
	game.StarterGui:SetCore("SendNotification", {
		Title = "Robbing...."; -- the title 
		Text = "Explosive Menu"; -- what the text says 
		Duration = 10; -- how long the notification should in secounds
	})

	wait(1)
	local pos = Vector3.new(-185.13201904296875, 19.877317428588867, -4682.09521484375) -- your pos here
	local delay = 8 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(12)
	local pos = Vector3.new(-75.57755279541016, 19.103355407714844, -4719.4013671875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(8)
	local pos = Vector3.new(-57.25518035888672, 19.929697036743164, -4634.249511718755) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(8)
	local pos = Vector3.new(61.0252571105957, 19.929697036743164, -4676.18505859375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(8)
	local pos = Vector3.new(53.26105499267578, 19.929697036743164, -4708.5546875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(1)
	local args = {
		[1] = "2457",
		[1] = "5028",
		[1] = "3380"
	}

	workspace:WaitForChild("Casino"):WaitForChild("RobberyDoor"):WaitForChild("Keypad"):WaitForChild("Pad"):WaitForChild("CasinoKeypadSubmit"):FireServer(unpack(args))
	wait(1)
	local pos = Vector3.new(46.62722396850586, 19.88067626953125, -4733.8359375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(5)
	local pos = Vector3.new(-15.923542976379395, 19.88067626953125, -4737.611328125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	wait(5)
	local pos = Vector3.new(-15.923542976379395, 19.88067626953125, -4737.611328125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	local pos = Vector3.new(-15.923542976379395, 19.88067626953125, -4737.611328125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-110.7985610961914, 73.12210083007812, -4610.15185546875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-58.74448776245117, 73.13204956054688, -4624.92333984375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	--2nd laptop
	local pos = Vector3.new(-78.99031829833984, 73.13204956054688, -4619.10595703125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-58.74448776245117, 73.13204956054688, -4624.92333984375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-46.8404541015625, 73.12216186523438, -4628.333984375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-24.962724685668945, 73.1221694946289, -4634.734375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-3.3408281803131104, 73.13223266601562, -4640.86279296875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(3.752683401107788, 73.13229370117188, -4643.49609375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(29.478313446044922, 73.13229370117188, -4650.5078125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(53.801265716552734, 73.13229370117188, -4657.15234375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(64.98200225830078, 73.1222915649414, -4660.33740234375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-13.397501945495605, 73.13119506835938, -4670.01806640625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	wait(5)
	--beginning of laptops+
	local pos = Vector3.new(-78.99031829833984, 73.13204956054688, -4619.10595703125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)
	--back casino
	local pos = Vector3.new(-44.969608306884766, 69.57959747314453, -4657.91162109375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)   
	local pos = Vector3.new(-15.499055862426758, 71.47806549072266, -4740.22509765625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5) 
	local pos = Vector3.new(-14.24863338470459, -77.02101135253906, -4744.541015625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(11.930963516235352, -77.02644348144531, -4746.82080078125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end

	local VirtualInputManager = game:GetService('VirtualInputManager')

	VirtualInputManager:SendKeyEvent(true,"E",false,game)

	wait(5)  
	local pos = Vector3.new(26.928058624267578, -77.27166748046875, -4751.21240234375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(48.125083923339844, -77.27167510986328, -4667.23779296875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(23.62175178527832, -77.27167510986328, -4661.197265625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(23.62175178527832, -77.27167510986328, -4661.197265625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(38.288169860839844, -77.07501983642578, -4571.92236328125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(85.00628662109375, -77.07501983642578, -4536.45458984375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(142.45065307617188, -77.02845001220703, -4525.43994140625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(169.9488067626953, -77.01850128173828, -4529.34814453125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(218.64842224121094, -77.1288070678711, -4528.17236328125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(259.5143127441406, -76.57250213623047, -4591.751953125) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	--13
	wait(5)  
	local pos = Vector3.new(264.51397705078125, -77.23490142822266, -4614.34130859375) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(237.00662231445312, -77.23233032226562, -4604.20556640625) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  --selling time
	local teleport = loadstring(game:HttpGet("https://pastebin.com/raw/CJv2dywH"))();
	teleport(CFrame.new(2276.103271484375, 18.834056854248047, -2060.843994140625));


	wait(5)  
	local pos = Vector3.new(2268.53759765625, 19.568363189697266, -2160.758544921875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end



	wait(5)  
	local pos = Vector3.new(2211.409423828125, 18.95522117614746, -2481.174560546875) -- your pos here
	local delay = 3 -- tp tween speed like how many seconds takes to tp

	-- do not edit below cuz breaks script

	local tween_s = game:GetService('TweenService')
	local tweeninfo = TweenInfo.new(delay,Enum.EasingStyle.Quad)

	local lp = game.Players.LocalPlayer

	if lp.Character and lp.Character:FindFirstChild('HumanoidRootPart') then
		local cf = CFrame.new(pos)
		local a = tween_s:Create(lp.Character.HumanoidRootPart,tweeninfo,{CFrame=cf})
		a:Play()
	end


	--18th 

end
