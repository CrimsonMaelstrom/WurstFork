/*
 * Copyright (C) 2014 - 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.hack;

import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

import net.minecraft.util.crash.CrashException;
import net.minecraft.util.crash.CrashReport;

public final class HackList
{
	// public final AntiAfkHack antiAfkHack = new AntiAfkHack();
	// public final AntiBlindHack antiBlindHack = new AntiBlindHack();
	// public final AntiCactusHack antiCactusHack = new AntiCactusHack();
	// public final AntiFireHack antiFireHack = new AntiFireHack();
	// public final AntiKnockbackHack antiKnockbackHack = new
	// AntiKnockbackHack();
	// public final AntiPotionHack antiPotionHack = new AntiPotionHack();
	// public final AntiSpamHack antiSpamHack = new AntiSpamHack();
	// public final AutoArmorHack autoArmorHack = new AutoArmorHack();
	// public final AutoBuildHack autoBuildHack = new AutoBuildHack();
	// public final AutoLeaveHack autoLeaveHack = new AutoLeaveHack();
	// public final AutoEatHack autoEatHack = new AutoEatHack();
	// public final AutoFarmHack autoFarmHack = new AutoFarmHack();
	// public final AutoFishHack autoFishHack = new AutoFishHack();
	// public final AutoMineHack autoMineHack = new AutoMineHack();
	// public final AutoRespawnHack autoRespawnHack = new AutoRespawnHack();
	// public final AutoSignHack autoSignHack = new AutoSignHack();
	// public final AutoSplashPotHack autoSplashPotHack = new
	// AutoSplashPotHack();
	// public final AutoSoupHack autoSoupHack = new AutoSoupHack();
	// public final AutoSprintHack autoSprintHack = new AutoSprintHack();
	// public final AutoStealHack autoStealHack = new AutoStealHack();
	// public final AutoSwitchHack autoSwitchHack = new AutoSwitchHack();
	// public final AutoSwordHack autoSwordHack = new AutoSwordHack();
	// public final AutoToolHack autoToolHack = new AutoToolHack();
	// public final AutoWalkHack autoWalkHack = new AutoWalkHack();
	// public final BaseFinderHack baseFinderHack = new BaseFinderHack();
	// public final BlinkHack blinkHack = new BlinkHack();
	// public final BoatFlyHack boatFlyHack = new BoatFlyHack();
	// public final BonemealAuraHack bonemealAuraHack = new BonemealAuraHack();
	// public final BowAimbotHack bowAimbotHack = new BowAimbotHack();
	// public final BuildRandomHack buildRandomHack = new BuildRandomHack();
	// public final BunnyHopHack bunnyHopHack = new BunnyHopHack();
	// public final CameraNoClipHack cameraNoClipHack = new CameraNoClipHack();
	// public final CaveFinderHack caveFinderHack = new CaveFinderHack();
	// public final ChestEspHack chestEspHack = new ChestEspHack();
	// public final ClickAuraHack clickAuraHack = new ClickAuraHack();
	// public final ClickGuiHack clickGuiHack = new ClickGuiHack();
	// public final CmdBlockHack cmdBlockHack = new CmdBlockHack();
	// public final CrashChestHack crashChestHack = new CrashChestHack();
	// public final CrashTagHack crashTagHack = new CrashTagHack();
	// public final CriticalsHack criticalsHack = new CriticalsHack();
	// public final DerpHack derpHack = new DerpHack();
	// public final DolphinHack dolphinHack = new DolphinHack();
	// public final ExcavatorHack excavatorHack = new ExcavatorHack();
	// public final ExtraElytraHack extraElytraHack = new ExtraElytraHack();
	// public final FancyChatHack fancyChatHack = new FancyChatHack();
	// public final FastBreakHack fastBreakHack = new FastBreakHack();
	// public final FastBowHack fastBowHack = new FastBowHack();
	// public final FastEatHack fastEatHack = new FastEatHack();
	// public final FastLadderHack fastLadderHack = new FastLadderHack();
	// public final FastPlaceHack fastPlaceHack = new FastPlaceHack();
	// public final FightBotHack fightBotHack = new FightBotHack();
	// public final FlightHack flightHack = new FlightHack();
	// public final FollowHack followHack = new FollowHack();
	// public final ForceOpHack forceOpHack = new ForceOpHack();
	// public final ForcePushHack forcePushHack = new ForcePushHack();
	// public final FreecamHack freecamHack = new FreecamHack();
	// public final FullbrightHack fullbrightHack = new FullbrightHack();
	// public final GhostHandHack ghostHandHack = new GhostHandHack();
	// public final GlideHack glideHack = new GlideHack();
	// public final HeadlessHack headlessHack = new HeadlessHack();
	// public final HeadRollHack headRollHack = new HeadRollHack();
	// public final HealthTagsHack healthTagsHack = new HealthTagsHack();
	// public final HighJumpHack highJumpHack = new HighJumpHack();
	// public final HomeHack homeHack = new HomeHack();
	// public final InstantBunkerHack instantBunkerHack = new
	// InstantBunkerHack();
	// public final InvWalkHack invWalkHack = new InvWalkHack();
	// public final ItemEspHack itemEspHack = new ItemEspHack();
	// public final JesusHack jesusHack = new JesusHack();
	// public final JetpackHack jetpackHack = new JetpackHack();
	// public final KaboomHack kaboomHack = new KaboomHack();
	// public final KillauraLegitHack killauraLegitHack = new
	// KillauraLegitHack();
	// public final KillauraHack killauraHack = new KillauraHack();
	// public final KillPotionHack killPotionHack = new KillPotionHack();
	// public final LiquidsHack liquidsHack = new LiquidsHack();
	// public final LogSpammerHack logSpammerHack = new LogSpammerHack();
	// public final LsdHack lsdHack = new LsdHack();
	// public final MassTpaHack massTpaHack = new MassTpaHack();
	// public final MileyCyrusHack mileyCyrusHack = new MileyCyrusHack();
	// public final MobEspHack mobEspHack = new MobEspHack();
	// public final MobSpawnEspHack mobSpawnEspHack = new MobSpawnEspHack();
	// public final MultiAuraHack multiAuraHack = new MultiAuraHack();
	// public final NameProtectHack nameProtectHack = new NameProtectHack();
	// public final NameTagsHack nameTagsHack = new NameTagsHack();
	// public final NavigatorHack navigatorHack = new NavigatorHack();
	// public final NoClipHack noClipHack = new NoClipHack();
	// public final NoFallHack noFallHack = new NoFallHack();
	// public final NoHurtcamHack noHurtcamHack = new NoHurtcamHack();
	// public final NoOverlayHack noOverlayHack = new NoOverlayHack();
	// public final NoSlowdownHack noSlowdownHack = new NoSlowdownHack();
	// public final NoWeatherHack noWeatherHack = new NoWeatherHack();
	// public final NoWebHack noWebHack = new NoWebHack();
	// public final NukerHack nukerHack = new NukerHack();
	// public final NukerLegitHack nukerLegitHack = new NukerLegitHack();
	// public final OverlayHack overlayHack = new OverlayHack();
	// public final PanicHack panicHack = new PanicHack();
	// public final ParkourHack parkourHack = new ParkourHack();
	// public final PhaseHack phaseHack = new PhaseHack();
	// public final PlayerEspHack playerEspHack = new PlayerEspHack();
	// public final PlayerFinderHack playerFinderHack = new PlayerFinderHack();
	// public final PotionSaverHack potionSaverHack = new PotionSaverHack();
	// public final ProphuntEspHack prophuntEspHack = new ProphuntEspHack();
	// public final ProtectHack protectHack = new ProtectHack();
	// public final RadarHack radarHack = new RadarHack();
	// public final RainbowUiHack rainbowUiHack = new RainbowUiHack();
	// public final RegenHack regenHack = new RegenHack();
	// public final RemoteViewHack remoteViewHack = new RemoteViewHack();
	// public final SafeWalkHack safeWalkHack = new SafeWalkHack();
	// public final ScaffoldWalkHack scaffoldWalkHack = new ScaffoldWalkHack();
	// public final SearchHack searchHack = new SearchHack();
	// public final SkinDerpHack skinDerpHack = new SkinDerpHack();
	// public final SneakHack sneakHack = new SneakHack();
	// public final SpammerHack spammerHack = new SpammerHack();
	// public final SpeedHackHack speedHackHack = new SpeedHackHack();
	// public final SpeedNukerHack speedNukerHack = new SpeedNukerHack();
	// public final SpiderHack spiderHack = new SpiderHack();
	// public final StepHack stepHack = new StepHack();
	// public final TemplateToolHack templateToolHack = new TemplateToolHack();
	// public final ThrowHack throwHack = new ThrowHack();
	// public final TimerHack timerHack = new TimerHack();
	// public final TiredHack tiredHack = new TiredHack();
	// public final TpAuraHack tpAuraHack = new TpAuraHack();
	// public final TrajectoriesHack trajectoriesHack = new TrajectoriesHack();
	// public final TriggerBotHack triggerBotHack = new TriggerBotHack();
	// public final TrollPotionHack trollPotionHack = new TrollPotionHack();
	// public final TrueSightHack trueSightHack = new TrueSightHack();
	// public final TunnellerHack tunnellerHack = new TunnellerHack();
	// public final XRayHack xRayHack = new XRayHack();
	
	private final TreeMap<String, Hack> hax =
		new TreeMap<>((o1, o2) -> o1.compareToIgnoreCase(o2));
	private final EnabledHacksFile enabledHacksFile;
	
	public HackList(Path enabledHacksFile, Path settingsFile)
	{
		this.enabledHacksFile = new EnabledHacksFile(enabledHacksFile);
		this.enabledHacksFile.load(this);
		
		try
		{
			for(Field field : HackList.class.getDeclaredFields())
			{
				if(!field.getName().endsWith("Hack"))
					continue;
				
				Hack hack = (Hack)field.get(this);
				hax.put(hack.getName(), hack);
			}
			
		}catch(Exception e)
		{
			CrashReport report =
				CrashReport.create(e, "Initializing Wurst hacks");
			throw new CrashException(report);
		}
	}
	
	public void saveEnabledHacks()
	{
		enabledHacksFile.save(this);
	}
	
	public Hack getHackByName(String name)
	{
		return hax.get(name);
	}
	
	public Collection<Hack> getAllHax()
	{
		return Collections.unmodifiableCollection(hax.values());
	}
	
	public int countHax()
	{
		return hax.size();
	}
}