package org.example.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Represents a collection of usernames used for assigning names to players.
 */
public class UsernameCollection
{
    private final List<String> usernames;
    private final Random randomizer;

    /**
     * Creates a new instance of {@code UsernameCollection} with a list of predefined usernames.
     */
    public UsernameCollection()
    {
        this.usernames = new ArrayList<String>();
        this.fillCollectionWithUsernames();
        this.randomizer = new Random();
    }

    /**
     * Adds a specified username to the list of usernames.
     * 
     * @param username the username to add.
     * @throws IllegalArgumentException if the given username is {@code null} or blank.
     */
    public void addUsername(String username)
    {
        if (username == null)
        {
            throw new IllegalArgumentException("Username cannot be null");
        }
        else if (username.isBlank())
        {
            throw new IllegalArgumentException("Username cannot be blank!");
        }
        this.usernames.add(username);
    }

    /**
     * Gets all the usernames from the collection.
     * 
     * @return a list of all the usernames.
     */
    public List<String> getUsernames()
    {
        return this.usernames;
    }

    /**
     * Fills the list of usernames with predefined usernames.
     */
    public void fillCollectionWithUsernames()
    {
        this.addUsername("Commodore");
        this.addUsername("Aqua");
        this.addUsername("Bay");
        this.addUsername("Coral");
        this.addUsername("Cove");
        this.addUsername("Delta");
        this.addUsername("Drake");
        this.addUsername("Harbor");
        this.addUsername("Jetty");
        this.addUsername("Ocean");
        this.addUsername("Reef");
        this.addUsername("Tide");
        this.addUsername("River");
        this.addUsername("Wave");
        this.addUsername("Wharf");
        this.addUsername("Anchor");
        this.addUsername("Breeze");
        this.addUsername("Captain");
        this.addUsername("Cast");
        this.addUsername("Catcher");
        this.addUsername("Current");
        this.addUsername("Deep");
        this.addUsername("Fisher");
        this.addUsername("Flounder");
        this.addUsername("Gale");
        this.addUsername("Hauler");
        this.addUsername("Hook");
        this.addUsername("Leviathan");
        this.addUsername("Lobster");
        this.addUsername("Navigator");
        this.addUsername("Netty");
        this.addUsername("Octave");
        this.addUsername("Paddle");
        this.addUsername("Pilot");
        this.addUsername("Poseidon");
        this.addUsername("Quay");
        this.addUsername("Ray");
        this.addUsername("Sailor");
        this.addUsername("Scallop");
        this.addUsername("Skipper");
        this.addUsername("Snapper");
        this.addUsername("Spray");
        this.addUsername("Trawler");
        this.addUsername("Voyager");
        this.addUsername("Abyss");
        this.addUsername("Breaker");
        this.addUsername("Crabber");
        this.addUsername("Drift");
        this.addUsername("Horizon");
        this.addUsername("Mackerel");
        this.addUsername("Narwhal");
        this.addUsername("Seaworthy");
        this.addUsername("Storm");
        this.addUsername("Billow");
        this.addUsername("Buoy");
        this.addUsername("Dolphin");
        this.addUsername("Gull");
        this.addUsername("Kelp");
        this.addUsername("Kraken");
        this.addUsername("Narrows");
        this.addUsername("Oyster");
        this.addUsername("Pelican");
        this.addUsername("Seaside");
        this.addUsername("Aurora");
        this.addUsername("Beacon");
        this.addUsername("Binnacle");
        this.addUsername("Blaze");
        this.addUsername("Bounty");
        this.addUsername("Braveheart");
        this.addUsername("Briny");
        this.addUsername("Buoyant");
        this.addUsername("Cannonball");
        this.addUsername("Clamshell");
        this.addUsername("Clipper");
        this.addUsername("Compass");
        this.addUsername("Corsair");
        this.addUsername("Crest");
        this.addUsername("Dawn");
        this.addUsername("Daybreak");
        this.addUsername("Deckhand");
        this.addUsername("Destiny");
        this.addUsername("Dolphin");
        this.addUsername("Driftwood");
        this.addUsername("Ensign");
        this.addUsername("Eureka");
        this.addUsername("Fairwind");
        this.addUsername("Fathom");
        this.addUsername("Finback");
        this.addUsername("Fjord");
        this.addUsername("Fury");
        this.addUsername("Galeforce");
        this.addUsername("Galley");
        this.addUsername("Glacier");
        this.addUsername("Gondola");
        this.addUsername("Harbour");
        this.addUsername("Highseas");
        this.addUsername("Horizon");
        this.addUsername("Humpback");
        this.addUsername("Inlet");
        this.addUsername("Ironclad");
        this.addUsername("Islander");
        this.addUsername("Jolly Roger");
        this.addUsername("Journey");
        this.addUsername("Keelhaul");
        this.addUsername("Landfall");
        this.addUsername("Lifeguard");
        this.addUsername("Lighthouse");
        this.addUsername("Littoral");
        this.addUsername("Lobsterpot");
        this.addUsername("Longitude");
        this.addUsername("Maelstrom");
        this.addUsername("Magellan");
        this.addUsername("Manatee");
        this.addUsername("Marina");
        this.addUsername("Marlin");
        this.addUsername("Masthead");
        this.addUsername("Mizzenmast");
        this.addUsername("Moonlight");
        this.addUsername("Nautilus");
        this.addUsername("Navigator");
        this.addUsername("Neptune");
        this.addUsername("Northwind");
        this.addUsername("Oarlock");
        this.addUsername("Orca");
        this.addUsername("Outcrop");
        this.addUsername("Outflow");
        this.addUsername("Outrig");
        this.addUsername("Pacific");
        this.addUsername("Paddleboard");
        this.addUsername("Paradise");
        this.addUsername("Periscope");
        this.addUsername("Pier");
        this.addUsername("Pirate");
        this.addUsername("Plank");
        this.addUsername("Portside");
        this.addUsername("Privateer");
        this.addUsername("Proa");
        this.addUsername("Raft");
        this.addUsername("Rampart");
        this.addUsername("Redsky");
        this.addUsername("Riptide");
        this.addUsername("Rudder");
        this.addUsername("Runabout");
        this.addUsername("Abyssal");
        this.addUsername("Anchorite");
        this.addUsername("Aquanaut");
        this.addUsername("Auroran");
        this.addUsername("Beachcomber");
        this.addUsername("Benthic");
        this.addUsername("Buoysmith");
        this.addUsername("Clamdigger");
        this.addUsername("Coastguard");
        this.addUsername("Coralreef");
        this.addUsername("Divergent");
        this.addUsername("Driftline");
        this.addUsername("Fathomless");
        this.addUsername("Fisherman");
        this.addUsername("Flotilla");
        this.addUsername("Gondolier");
        this.addUsername("Harpooner");
        this.addUsername("Hydrate");
        this.addUsername("Islet");
        this.addUsername("Jellyfish");
        this.addUsername("Lighthousekeeper");
        this.addUsername("Lobsterman");
        this.addUsername("Mainsail");
        this.addUsername("Mangrove");
        this.addUsername("Maritime");
        this.addUsername("Masts");
        this.addUsername("Moonstone");
        this.addUsername("Nautical");
        this.addUsername("Oceanic");
        this.addUsername("Oceanknight");
        this.addUsername("Oceanside");
        this.addUsername("Pilotfish");
        this.addUsername("Porthole");
        this.addUsername("Quahog");
        this.addUsername("Ribbonreef");
        this.addUsername("Riptide");
        this.addUsername("Rockpool");
        this.addUsername("Saltmine");
        this.addUsername("Sanddollar");
        this.addUsername("Seafoam");
        this.addUsername("Sealife");
        this.addUsername("Seashanty");
        this.addUsername("Seashell");
        this.addUsername("Seaweed");
        this.addUsername("Shipshape");
        this.addUsername("Squid");
        this.addUsername("Starboard");
        this.addUsername("Stowaway");
        this.addUsername("Surfboard");
        this.addUsername("Tidalpool");
        this.addUsername("Aquamarine");
        this.addUsername("Azul");
        this.addUsername("Baltic");
        this.addUsername("Barnacle");
        this.addUsername("Beaufort");
        this.addUsername("Bilge");
        this.addUsername("Bluefin");
        this.addUsername("Bowline");
        this.addUsername("Breakwater");
        this.addUsername("Buccaneer");
        this.addUsername("Cabinboy");
        this.addUsername("Cape");
        this.addUsername("Caravel");
        this.addUsername("Chantey");
        this.addUsername("Clippership");
        this.addUsername("Comber");
        this.addUsername("Cordage");
        this.addUsername("Corsica");
        this.addUsername("Cruise");
        this.addUsername("Cruiser");
        this.addUsername("Cutlass");
        this.addUsername("Davy Jones");
        this.addUsername("Deepsea");
        this.addUsername("Dory");
        this.addUsername("Dredger");
        this.addUsername("Eddy");
        this.addUsername("Emperor");
        this.addUsername("Fairway");
        this.addUsername("Farallon");
        this.addUsername("Ferryman");
        this.addUsername("Finchaser");
        this.addUsername("Fishmonger");
        this.addUsername("Fishingboat");
        this.addUsername("Flagship");
        this.addUsername("Foghorn");
        this.addUsername("Footrope");
        this.addUsername("Forecastle");
        this.addUsername("Freeboard");
        this.addUsername("Frigate");
        this.addUsername("Galleon");
        this.addUsername("Gammarus");
        this.addUsername("Gliding");
        this.addUsername("Greenhorn");
        this.addUsername("Gulf");
        this.addUsername("Gunwale");
        this.addUsername("Halyard");
        this.addUsername("Harpooning");
        this.addUsername("Helm");
        this.addUsername("Highwater");
        this.addUsername("Hull");
        this.addUsername("Inshore");
        this.addUsername("Ironside");
        this.addUsername("Jib");
        this.addUsername("Jollyboat");
        this.addUsername("Keelson");
        this.addUsername("Ketch");
        this.addUsername("Knot");
        this.addUsername("Lacuna");
        this.addUsername("Lagoon");
        this.addUsername("Lakeward");
        this.addUsername("Lantern");
        this.addUsername("Launch");
        this.addUsername("Leeboard");
        this.addUsername("Leeward");
        this.addUsername("Lifeboat");
        this.addUsername("Lifering");
        this.addUsername("Lighthousekeeper");
        this.addUsername("Logbook");
        this.addUsername("Longitude");
        this.addUsername("Mackerelshark");
        this.addUsername("Mainbrace");
        this.addUsername("Mainmast");
        this.addUsername("Mainsheet");
        this.addUsername("Manowar");
        this.addUsername("Maritime");
        this.addUsername("Marlinfishing");
        this.addUsername("Martingale");
        this.addUsername("Mast");
        this.addUsername("Megrim");
        this.addUsername("Meridian");
        this.addUsername("Midship");
        this.addUsername("Mooring");
        this.addUsername("Mullet");
        this.addUsername("Nauticalmile");
        this.addUsername("Navigator");
        this.addUsername("Neaptide");
        this.addUsername("Nets");
        this.addUsername("Nipper");
        this.addUsername("Offshore");
        this.addUsername("Outboard");
        this.addUsername("Paddle");
        this.addUsername("Paddling");
        this.addUsername("Painted");
        this.addUsername("Palm");
        this.addUsername("Parasail");
        this.addUsername("Perch");
        this.addUsername("Pierhead");
        this.addUsername("Piloting");
        this.addUsername("Pinrail");
        this.addUsername("Plankton");
    }

    /**
     * Gets a random username from the list of usernames.
     * 
     * @return a random username.
     */
    public String getRandomUsername()
    {
        int randomIndex = randomizer.nextInt(this.usernames.size());
        String randomUserName = this.usernames.get(randomIndex);
        this.usernames.remove(randomIndex);
        return randomUserName;
    }
}
